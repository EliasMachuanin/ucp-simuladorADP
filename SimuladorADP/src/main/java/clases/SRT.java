
package clases;
import com.ucp.simuladoradp.main.FifoView;
import java.util.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sala 23 - pcs 16
 */
public class SRT extends Algoritmo implements Runnable{
    
    
    
    
    public SRT(String nombre, String caracteristicas, String ventaja, ArrayList<Proceso> procesos){
        super(nombre, caracteristicas, ventaja);
        Collections.sort(procesos);
        super.setPendiente(new ProcesoTableModel(procesos));
        super.setEjecutando(new ProcesoTableModel(new ArrayList<Proceso>()));
        super.setListo(new ProcesoTableModel(new ArrayList<Proceso>()));
        this.setProcesos(procesos);
        
    }
    
    public SRT(String nombre, String caracteristicas, String funcion, String ventaja, Proceso proceso){
        super(nombre, caracteristicas, ventaja);
        this.setProcesos(new ArrayList<Proceso>());
        this.agregarProceso(proceso);
    }
    
    public boolean agregarProceso(Proceso proceso){
        return this.getProcesos().add(proceso);
    }
    
    public boolean quitarProceso(Proceso proceso){
        return this.getProcesos().remove(proceso);
    }

    public void run() {
            Proceso proceso, proceso2;//creamos un proceso de la clase proceso
            //this.fifoView.getTimerCpu().setText("0");//seteamos el valor de la vista fifo con valor cero (0)
            
            int timer = 0;//creamos una variable timer con inicializacion cero (0)
            
            while(!super.todosFinalizados()){//mientras haya procesos en la tabla de pendientes por atender
                for (Proceso procesoActual : super.getProcesos()) {
                    if(procesoActual.getInstante_entrada()==timer){
                        super.getPendiente().addRow(procesoActual);
                    }
                }
                if(super.getPendiente().getRowCount()>0 || super.getEjecutando().getRowCount()>0){
                    if((super.getEjecutando().getRowCount()>0)&&((super.getEjecutando().getProceso(0).getDuracionRestante() <
                                super.getPendiente().getProceso(super.getPendiente().procesoMenorTiempoRestante()).getDuracionRestante())||(super.getPendiente().getRowCount()<1))){
                        proceso = super.getEjecutando().getProceso(0);
                    }
                    else if((super.getEjecutando().getRowCount()>0)&&(super.getEjecutando().getProceso(0).getDuracionRestante() >
                                super.getPendiente().getProceso(super.getPendiente().procesoMenorTiempoRestante()).getDuracionRestante())){
                        proceso = super.getPendiente().getProceso(super.getPendiente().procesoMenorTiempoRestante());//carga proceso de la tabla pendiente a la variable proceso
                        proceso2 = super.getEjecutando().getProceso(0);
                        super.getEjecutando().removeRow(0);
                        super.getPendiente().addRow(proceso2);
                        super.getPendiente().removeRow(super.getPendiente().procesoMenorTiempoRestante());//una vez cargado el proceso se remueva de la tabla pendiente
                        super.getEjecutando().addRow(proceso);//se envia el proceso a la tabla de procesos en ejecucion
                    }
                    else{
                       proceso = super.getPendiente().getProceso(super.getPendiente().procesoMenorTiempoRestante());//carga proceso de la tabla pendiente a la variable proceso
                       super.getPendiente().removeRow(super.getPendiente().procesoMenorTiempoRestante());//una vez cargado el proceso se remueva de la tabla pendiente
                       super.getEjecutando().addRow(proceso);//se envia el proceso a la tabla de procesos en ejecucion
                    }
                    timer++;//variable timer aumenta en uno
                    super.getEjecutando().getProceso(0).calcularDuracionRestante(1);
                    //for (int i = 0; i < proceso.getDuracion(); i++){//para i iniciando en 0 hasta i menor al tiempo de rafaga de cpu, i aumenta en 1
                        //this.fifoView.getTimerCpu().setText(Integer.toString(timer));//setea el valor del componente de la vist fifo para mostrar en la rafaga de cpu el valor del tiempo
                        try {
                            Thread.sleep(3000);//el hilo queda en modo espera por 1 segundo
                        } catch (InterruptedException ex) {
                            Logger.getLogger(FifoView.class.getName()).log(Level.SEVERE, null, ex);//en caso de ocurrir un error en la ejecucion se enviara un mensaje de aviso informando del error
                        }
                    //}
                    if(proceso.getDuracionRestante()<=0){
                        super.getEjecutando().removeRow(0);//sacamos el proceso de la tabla procesos en ejecucion
                        super.getListo().addRow(proceso);//cargamos el proceso en la tabla procesos terminados
                        super.getProcesoByID(proceso.getId()).finalizar();
                    }
                    
            }
                else{
                    timer++;
                    //this.fifoView.getTimerCpu().setText(Integer.toString(timer));//setea el valor del componente de la vist fifo para mostrar en la rafaga de cpu el valor del tiempo
                    try {
                        Thread.sleep(3000);//el hilo queda en modo espera por 1 segundo
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FifoView.class.getName()).log(Level.SEVERE, null, ex);//en caso de ocurrir un error en la ejecucion se enviara un mensaje de aviso informando del error
                }
            }
        }
            super.resetProcesos();
    }
}