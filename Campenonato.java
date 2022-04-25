import javax.swing.*;
public class Campenonato {
    private String Nombre;
    private int edad, participante;
    private double peso, pso1 , pso2, pso3;
    public void Campeonato(){
        Nombre = ""; edad = 0; pso1 = 0.0; pso2 = 0.0 ; pso3 = 0.0; participante = 0;
    }
    public void Insertardatos(){
        do{
        Nombre = JOptionPane.showInputDialog("Ingrese el nombre del participante");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del participante"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del participante"));
        
            if(edad < 13 || edad > 17){
                        JOptionPane.showInputDialog("No puedes participar del campeonato");
            }
                while(edad >= 13 || edad <= 17);           
        }]
    }
    public void calculardatos(){

    }
}
