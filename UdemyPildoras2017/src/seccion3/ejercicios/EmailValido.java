package seccion3.ejercicios;

import javax.swing.JOptionPane;

public class EmailValido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean valido = false;
        
        do {
            String email = JOptionPane.showInputDialog("Ingrese su correo Electronico");
            int arroba=0;
            boolean punto = false;
            
            for (int i = 0; i < email.length(); i++) {
                if(email.charAt(i)=='@') arroba++;
                if(email.charAt(i)=='.') punto=true;
                
            }
            
            if (arroba==1 && punto == true && email.length()>=4) valido = true;
            
            else JOptionPane.showMessageDialog(null, "Email no valido!!");

        } while (valido== false);
        JOptionPane.showMessageDialog(null, "Correo Valido");
    }

}
