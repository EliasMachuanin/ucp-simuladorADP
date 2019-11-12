package clases;
import com.ucp.simuladoradp.main.FifoView;
import com.ucp.simuladoradp.main.RRView;
import com.ucp.simuladoradp.main.SRTView;
import java.util.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RR extends Algoritmo implements Runnable{
    
    
    /**
     * @return the spnView
     */
    public RRView getRRView() {
        return rrView;
    }

    /**
     * @param spnView the spnView to set
     */
    public void setRRView(RRView rrView) {
        this.rrView = rrView;
    }
    
    private RRView rrView;
    private int quanto;
    
    
    public RR(String nombre, String caracteristicas, String ventaja, ArrayList<Proceso> procesos, int quanto){
        super(nombre, caracteristicas, ventaja);
        Collections.sort(procesos);
        super.setPendiente(new ProcesoTableModel(procesos));
        super.setEjecutando(new ProcesoTableModel(new ArrayList<Proceso>()));
        super.setListo(new ProcesoTableModel(new ArrayList<Proceso>()));
        this.setProcesos(procesos);
        this.setQuanto(quanto);
        
    }
    
    public RR(String nombre, String caracteristicas, String funcion, String ventaja, Proceso proceso){
        super(nombre, caracteristicas, ventaja);
        this.setProcesos(new ArrayList<Proceso>());
        this.agregarProceso(proceso);
    }
    
    public RR(String nombre, String caracteristicas, String ventaja, ArrayList<Proceso> procesos, RRView rrView){
        super(nombre, caracteristicas, ventaja);
        Collections.sort(procesos);
        super.setPendiente(new ProcesoTableModel(procesos));
        super.setEjecutando(new ProcesoTableModel(new ArrayList<Proceso>()));
        super.setListo(new ProcesoTableModel(new ArrayList<Proceso>()));
        this.setProcesos(procesos);
        this.setRRView(rrView);
        this.rrView.getjTableProcesosEspera().setModel(super.getPendiente());
        this.rrView.getjTableProcesoEnCurso().setModel(super.getEjecutando());
        this.rrView.getjTableProcesosTerminados().setModel(super.getListo());
    }
    
    public boolean agregarProceso(Proceso proceso){
        return this.getProcesos().add(proceso);
    }
    
    public boolean quitarProceso(Proceso proceso){
        return this.getProcesos().remove(proceso);
    }

    public void run() {
            Proceso proceso, proceso2;//creamos un proceso de la clase proceso
            this.getRRView().getTimerCpu().setText("0");//seteamos el valor de la vista fifo con valor cero (0)
            
            int timer = 0, tiempoDisponible = 0;//creamos una variable timer con inicializacion cero (0)
            
            
            while(!super.todosFinalizados()){//mientras haya procesos en la tabla de pendientes por atender
                for (Proceso procesoActual : super.getProcesos()) {
                    if(procesoActual.getInstante_entrada()==timer){
                        super.getPendiente().addRow(procesoActual);
                    }
                }
                if(super.getPendiente().getRowCount()>0 || super.getEjecutando().getRowCount()>0){
                    if((tiempoDisponible == this.getQuanto())&&(super.getPendiente().getRowCount()>0)&&(super.getEjecutando().getRowCount()>0)){
                        proceso = super.getPendiente().getProceso(0);//carga proceso de la tabla pendiente a la variable proceso
                        proceso2 = super.getEjecutando().getProceso(0);
                        super.getEjecutando().removeRow(0);
                        super.getPendiente().addRow(proceso2);
                        super.getPendiente().removeRow(0);//una vez cargado el proceso se remueva de la tabla pendiente
                        super.getEjecutando().addRow(proceso);//se envia el proceso a la tabla de procesos en ejecucion
                        tiempoDisponible = 0;
                    }
                    else if(super.getPendiente().getRowCount()>0 && super.getEjecutando().getRowCount()==0){
                        proceso = super.getPendiente().getProceso(0);//carga proceso de la tabla pendiente a la variable proceso
                        super.getPendiente().removeRow(0);//una vez cargado el proceso se remueva de la tabla pendiente
                       super.getEjecutando().addRow(proceso);//se envia el proceso a la tabla de procesos en ejecucion
                       tiempoDisponible = 0;
                    }
                    else{
                       proceso = super.getEjecutando().getProceso(0);
                    }
                    timer++;//variable timer aumenta en uno
                    tiempoDisponible++;
                    super.getEjecutando().getProceso(0).calcularDuracionRestante(1);
                        this.getRRView().getTimerCpu().setText(Integer.toString(timer));//setea el valor del componente de la vist fifo para mostrar en la rafaga de cpu el valor del tiempo
                        try {
                            Thread.sleep(3000);//el hilo queda en modo espera por 1 segundo
                        } catch (InterruptedException ex) {
                            Logger.getLogger(FifoView.class.getName()).log(Level.SEVERE, null, ex);//en caso de ocurrir un error en la ejecucion se enviara un mensaje de aviso informando del error
                        }
                    if(proceso.getDuracionRestante()<=0){
                        super.getEjecutando().removeRow(0);//sacamos el proceso de la tabla procesos en ejecucion
                        super.getListo().addRow(proceso);//cargamos el proceso en la tabla procesos terminados
                        super.getProcesoByID(proceso.getId()).finalizar();
                    }
            }
                else{
                    timer++;
                    this.getRRView().getTimerCpu().setText(Integer.toString(timer));//setea el valor del componente de la vist fifo para mostrar en la rafaga de cpu el valor del tiempo
                    try {
                        Thread.sleep(3000);//el hilo queda en modo espera por 1 segundo
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FifoView.class.getName()).log(Level.SEVERE, null, ex);//en caso de ocurrir un error en la ejecucion se enviara un mensaje de aviso informando del error
                }
            }
                
                
                
        }
            super.resetProcesos();
    }

    /**
     * @return the quanto
     */
    public int getQuanto() {
        return quanto;
    }

    /**
     * @param quanto the quanto to set
     */
    public void setQuanto(int quanto) {
        this.quanto = quanto;
    }
}