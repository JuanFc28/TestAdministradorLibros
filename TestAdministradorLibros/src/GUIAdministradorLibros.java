import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIAdministradorLibros{
    private JFrame frame;
    private AdministradorLibros admin;
    JLabel e1, e2, e3, e4;
    JButton b1;
    JTextField tf1, tf2, tf3, tf4;
    JTextArea ta1;
    
    public GUIAdministradorLibros(){
        frame = new JFrame("Administrador de Libros");
        admin = new AdministradorLibros();
        
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menu = new JMenu("Opciones");
        JMenuItem agregarItem = new JMenuItem("Agregar libro");
        JMenuItem eliminarItem = new JMenuItem("Eliminar libro por ISBN");
        JMenuItem mostrarItem = new JMenuItem("Mostrar todos los libros");
        JMenuItem salir = new JMenuItem("Salir");
        
        menu.add(agregarItem);
        menu.add(eliminarItem);
        menu.add(mostrarItem);
        menu.add(salir);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        
        etiquetas();
        botones();
        campoTexto();
        areaTexto();

        agregarItem.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Libro nuevoLibro = new Libro(tf1.getText(), tf2.getText(), tf3.getText());
                admin.agregarLibro(nuevoLibro);
                // Lógica para agregar libro...*/
            }
        });
        
        eliminarItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                admin.eliminarLibroPorISBN(tf4.getText());
                    
                // Lógica para eliminar libro por ISBN...
            }
        });
        
        mostrarItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               ta1.setText("Estos son los libros de la biblioteca: \n"); 
               ta1.append(admin.mostrarLibros());

                // Lógica para mostrar todos los libros...
            }
        });
        
        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                
            }
        });
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void etiquetas(){
        e1 = new JLabel("Ingresa el titulo:");
        this.frame.add(e1);
        e1.setBounds(20, 30, 100, 15);
        e2 = new JLabel("Ingresa el autor:");
        this.frame.add(e2);
        e2.setBounds(20, 60, 100, 15);
        e3 = new JLabel("Ingresa el ISBN:");
        this.frame.add(e3);
        e3.setBounds(20, 90, 100, 15);
        e4 = new JLabel("Ingresa el ISBN a eliminar:");
        this.frame.add(e4);
        e4.setBounds(20, 120, 170, 15);
    }

    private void botones(){
        b1 = new JButton("Borrar");
        this.frame.add(b1);
        b1.setBounds(300, 75, 100, 20);

        ActionListener accionBorrar = new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String borrar;
                        borrar = "";
                        tf1.setText(borrar);
                        tf1.setBackground(Color.WHITE);
                        tf2.setText(borrar);
                        tf2.setBackground(Color.WHITE);
                        tf3.setText(borrar);
                        tf3.setBackground(Color.WHITE);
                        tf4.setText(borrar);
                        tf4.setBackground(Color.WHITE);
                        ta1.setText(borrar);
                        ta1.setBackground(Color.WHITE);
                    }
                };
                b1.addActionListener(accionBorrar);
    }

    private void campoTexto(){
        tf1 = new JTextField();
        this.frame.add(tf1);
        tf1.setBounds(150, 30, 100, 15);
        tf2 = new JTextField();
        this.frame.add(tf2);
        tf2.setBounds(150, 60, 100, 15);
        tf3 = new JTextField();
        this.frame.add(tf3);
        tf3.setBounds(150, 90, 100, 15);
        tf4 = new JTextField();
        this.frame.add(tf4);
        tf4.setBounds(190, 120, 100, 15);
    }

    private void areaTexto(){
        ta1 = new JTextArea();
        this.frame.setLayout(null);
        this.frame.add(ta1); 
        ta1.setBounds(20, 170, 400, 150);
    }
    
}