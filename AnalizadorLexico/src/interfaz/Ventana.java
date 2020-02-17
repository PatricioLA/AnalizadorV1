package Interfaz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {
 //variables utilizadas a lo largo de programa.
     int cont;
    char[] car;
    String cadena;
    boolean valida;

    public Ventana() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajadetexto1 = new javax.swing.JTextField();
        Analizar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cajadetexto3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajadetexto2 = new javax.swing.JTextArea();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        jLabel1.setText("ANALIZADOR");
        jLabel2.setText("Ingrese cadena:");
        cajadetexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajadetexto1ActionPerformed(evt);
            }
        });
        
        Analizar.setText("Analizar");
        Analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarActionPerformed(evt);
            }
        });
 
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
 
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        
        cajadetexto3.setColumns(20);
        cajadetexto3.setRows(5);
        jScrollPane2.setViewportView(cajadetexto3);
        jLabel3.setText("TOKENS");
        jLabel4.setText("ESTADOS");
        cajadetexto2.setColumns(20);
        cajadetexto2.setRows(30);
        cajadetexto2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cajadetexto2PropertyChange(evt);
            }
        });
 
        jScrollPane1.setViewportView(cajadetexto2);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                    .addGap(243, 243, 243)
                    .addComponent(jLabel1).addGap(0, 226, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                    .addComponent(Analizar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Limpiar)
                    .addGap(18, 18, 18)
                    .addComponent(Salir))
                    .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cajadetexto1,javax.swing.GroupLayout.PREFERRED_SIZE, 411,javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addContainerGap())
        );
        
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel2)
            .addComponent(cajadetexto1, javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188,javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45,javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21,Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(Analizar)
            .addComponent(Limpiar)
            .addComponent(Salir))
            .addGap(21, 21, 21))
        );
        pack();
    }// </editor-fold>
 
    
    private void cajadetexto1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void AnalizarActionPerformed(java.awt.event.ActionEvent evt) {
        //getText() se usa para obtener la cadena ingresada en el cuadro de texto.
        cadena=this.cajadetexto1.getText();
        //esta parte de codio corresponde al analizador lexico.
        String expresion = ("(\\d+\\.\\d+)|(\\d+)|([a-z_0-9]+)|([+_-])+|([*_/])+|(<=)|(>=)|(!=)|(==)|(<)|(>)|(&&)|(!)|(OR)+|(;)|([{])+|([}])+|([(])+|([)])+|(IF)+|(WHILE)+|(RETURN)+|(ELSE)+|(INT)+|(FLOAT)+");
        Pattern p = Pattern.compile(expresion);
        Matcher matcher = p.matcher(cadena);
        while(matcher.find()){
            
            /*
            String token0 = matcher.group(0);
            if(token0 != null){
                cajadetexto2.append("Hexadecimal : " + token0 + '\n');
            }
            */
            String token1 = matcher.group(1);
            if(token1 != null){
                cajadetexto2.append("Numero real: " + token1 + '\n');
            }
            
            String token2 = matcher.group(2);
            if(token2 != null){
                cajadetexto2.append("Numero Entero: " + token2 + '\n');
            }

            String token3 = matcher.group(3);
            if(token3 != null){
                cajadetexto2.append("Identificador: " + token3 + '\n');
            }

            String token4 = matcher.group(4);
            if(token4 != null){
                cajadetexto2.append("Operador de Suma: " + token4 + '\n');
            }
            
            String token5 = matcher.group(5);
            if(token5 != null){
                cajadetexto2.append("Operador de Multiplicacion: " + token5 + '\n');
            }
            
            String token6 = matcher.group(6);
                if(token6 != null){
                    cajadetexto2.append("Operador relacional: " + token6 + '\n');
                }
            String token7 = matcher.group(7);
                if(token7 != null){
                    cajadetexto2.append("Operador relacional: " + token7 + '\n');
                }
            String token8 = matcher.group(8);
                if(token8 != null){
                    cajadetexto2.append("Operador relacional: " + token8 + '\n');
                }
                
            String token9 = matcher.group(9);
                if(token9 != null){
                    cajadetexto2.append("Operador relacional: " + token9 + '\n');
                }
                
            String token10 = matcher.group(10);
                if(token10 != null){
                    cajadetexto2.append("Operador relacional: " + token10 + '\n');
                }
                
            String token11 = matcher.group(11);
                if(token11 != null){
                    cajadetexto2.append("Operador relacional: " + token11 + '\n');
                }
                
            String token12 = matcher.group(12);
                if(token12 != null){
                    cajadetexto2.append("Operador And: " + token12 + '\n');
                }
            
            String token13 = matcher.group(13);
                if(token13 != null){
                cajadetexto2.append("Operador Not: " + token13 + '\n');
            }
            
            String token14 = matcher.group(14);
                if(token14 != null){
                cajadetexto2.append("Operador Or: " + token14 + '\n');
            }
                
            String token15 = matcher.group(15);
                if(token15 != null){
                cajadetexto2.append("Punto y coma: " + token15 + '\n');
            }
            
            String token16 = matcher.group(16);
                if(token16 != null){
                cajadetexto2.append("Llave: " + token16 + '\n');
            }
            
            String token17 = matcher.group(17);
                if(token17 != null){
                cajadetexto2.append("Llave: " + token17 + '\n');
            }
            
            String token18 = matcher.group(18);
                if(token18 != null){
                cajadetexto2.append("Parentesis: " + token18 + '\n');
            }
                
            String token19 = matcher.group(19);
                if(token19 != null){
                cajadetexto2.append("Parentesis: " + token19 + '\n');
            }
            
            String token20 = matcher.group(20);
                if(token20 != null){
                cajadetexto2.append("Palabra reservada: " + token20 + '\n');
            }
        
            String token21 = matcher.group(21);
                if(token21 != null){
                cajadetexto2.append("Palabra reservada: " + token21 + '\n');
            }
                
            String token22 = matcher.group(22);
                if(token22 != null){
                cajadetexto2.append("Palabra reservada: " + token22 + '\n');
            }
                
            String token23 = matcher.group(23);
                if(token23 != null){
                cajadetexto2.append("Palabra reservada: " + token23 + '\n');
            }
                
            String token24 = matcher.group(24);
                if(token24 != null){
                cajadetexto2.append("Palabra reservada: " + token24 + '\n');
            }
                
            String token25 = matcher.group(25);
                if(token25 != null){
                cajadetexto2.append("Palabra reservada: " + token25 + '\n');
            }    
            /*
            String token9 = matcher.group(9);
            if(token9 != null){
                cajadetexto2.append("Exponencial: " + token9 + '\n');
            }*/
            /*
            
            */
        }
        //aqui se llama a la funcion para el automata.
        inicio();
        if(valida){
            JOptionPane.showMessageDialog(null, "Expresion valida");
        }  
    }
 
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);//esta linea de codigo es para dar la funcion de salida del programa.
    } 
    
    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        //en esta parte del programa es en donde se le da la capacidad de borrar los campos de textoal boton limpiar.
        cajadetexto1.setText(null);
        cajadetexto2.setText(null);
        cajadetexto3.setText(null);
    }
    
    private void cajadetexto2PropertyChange(java.beans.PropertyChangeEvent evt) {
        // TODO add your handling code here:
    }
    
    //apartir de aqui esta parte del codigo es la programacion del comprtamiento del automata y sustransiciones.
    private void inicio(){
        cont=0;
        valida=false;
        car=cadena.toCharArray();
        q0();
    }
    
    private void q0(){
        if(cont<cadena.length()){
            cajadetexto3.append("q0, ");
            if(car[cont]>='a' && car[cont]<='z'){
                cont++;
                q1();
            }
            else if(car[cont] >= 'A' && car[cont] <= 'Z'){
                cont++;
                q4();
            }else if(car[cont]>='0' && car[cont]<='9'){
                cont++;
                q2();
            }else if(car[cont]=='<' || car[cont]=='>' || car[cont]=='!' || car[cont]=='='){
                cont++;
                q3();
            }else if(car[cont]=='!'){
                cont++;
                q3();
            }else if(car[cont]=='&'){
                cont++;
                q6();
            }else if(car[cont]=='{'){
                cont++;
                q2();
            }else if(car[cont]=='('){
                cont++;
                q2();
            }
            
        } 
    }
 
    private void q1(){
        cajadetexto3.append("q1, ");
        if(cont<cadena.length()){
            if(car[cont]>='a' && car[cont]<='z' || car[cont] >= 'A' && car[cont] <= 'Z'){
                cont++;
                q1();
            }else if(car[cont]==';'){
                cont++;
                q11();
            }
        }
    }
 
    private void q2(){
        cajadetexto3.append("q2, ");
        if(cont<cadena.length()){
            if(car[cont]>='0' && car[cont]<='9'){
                cont++;
                q2();
            }else if(car[cont]=='+' || car[cont]=='-' || car[cont]=='*' || car[cont]=='/' || car[cont]=='^'){
                cont++;
                q3();
            }else if(car[cont]=='.'){
                cont++;
                q5();
            }else if(car[cont]==';'){
                cont++;
                q11();
            }else if(car[cont]=='<' || car[cont]=='>' || car[cont]=='!' || car[cont]=='='){
                cont++;
                q3();
            }else if(car[cont]==')'){
                cont++;
                q3();
            }else if(car[cont]=='}'){
                q3();
            }
        }
    }
    
    private void q3(){
        cajadetexto3.append("q3, ");
        if(cont<cadena.length()){
            if(car[cont]>='='){
                cont++;
                q2();
            }else if(car[cont]>='0' && car[cont]<='9'){
                cont++;
                q2();
            }else if(car[cont]==';'){
                cont++;
                q11();
            }
            
        }
    } 
 
    private void q4(){
        cajadetexto3.append("q4, ");
        if(cont<cadena.length()){
            if(car[cont] >= 'A' && car[cont] <= 'Z'){
                cont++;
                q4();
            }
            else if(car[cont]==';'){
                cont++;
                q11();
            }
        }
    }
    private void q5(){
        cajadetexto3.append("q5, ");
        if(cont<cadena.length()){
            if(car[cont]>='0' && car[cont]<='9'){
                cont++;
                q2();
            }else if(car[cont]=='+' || car[cont]=='-' || car[cont]=='*' || car[cont]=='/' || car[cont]=='^'){
                cont++;
                q5();
            }else if(car[cont]==';'){
                cont++;
                q11();
            }
        }
    }
 
    private void q6(){
        cajadetexto3.append("q6, ");
            if(cont<cadena.length()){    
                if(car[cont]=='&'){
                    cont++;
                    q11();
                }
            }
    }
    private void q11(){
        cajadetexto3.append("q11, ");
        valida=true;
    }
 
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
            javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE,null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE,null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE,null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE,null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify
    private javax.swing.JButton Analizar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField cajadetexto1;
    private javax.swing.JTextArea cajadetexto2;
    private javax.swing.JTextArea cajadetexto3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration
 }