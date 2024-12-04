package dulcehogar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class VentanaPrincipal extends JFrame {

    // Array donde guardaremos los socios
    private ArrayList<Socio> socios = new ArrayList<>();
    // validaciones
    private Validar validador = new Validar();

    public VentanaPrincipal() {
        // Configuración de la ventana principal
        setTitle("Sistema Dulce Hogar");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 100, 10));

        // Crear los botones
        JButton btnRegistrar = new JButton("Registrar Socio");
        JButton btnVerDatos = new JButton("Ver Datos Socio");
        JButton btnPagarCuota = new JButton("Pagar Cuota Mensual");
        JButton btnCuotaCancelada = new JButton("Consultar Monto Total Cancelado");
        JButton btnPorPagar = new JButton("Consultar Cuotas Por Pagar");

        // Agregar los botones a la ventana
        add(btnRegistrar);
        add(btnVerDatos);
        add(btnPagarCuota);
        add(btnCuotaCancelada);
        add(btnPorPagar);

        // Acción del botón Registrar Socio
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFormularioRegistrar();
            }
        });

        // Acción del botón Ver Datos Socio
        btnVerDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFormularioVerDatos();
            }
        });

        //Acción del botón Cancelar cuota Mensual
        btnPagarCuota.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFormularioPagarCuota();
            }
        });

        // Acción del boton Consultar Cuota Cancelada
        btnCuotaCancelada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFormularioCuotaCancelada();
            }
        });
        
        // Acción del botón Monto Total Cancelado
        btnPorPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                mostrarFormularioPorPagar();
            }
        });
    }

    private void mostrarFormularioRegistrar() {
        // Crear nueva ventana para registrar un socio
        JFrame formularioRegistrar = new JFrame("Registrar Socio");
        formularioRegistrar.setSize(500, 600);
        formularioRegistrar.setLayout(new GridLayout(10, 1));

        JLabel lblNombre = new JLabel("Nombre");
        JTextField txtNombre = new JTextField(20);
        JLabel lblAppPaterno = new JLabel("Apellido Paterno");
        JTextField txtAppPaterno = new JTextField(20);
        JLabel lblAppMaterno = new JLabel("Apellido Materno");
        JTextField txtAppMaterno = new JTextField(20);
        JLabel lblRut = new JLabel("RUT (12.345.678-9)");
        JTextField txtRut = new JTextField(20);
        JLabel lblCorreo = new JLabel("Correo");
        JTextField txtCorreo = new JTextField(20);
        JLabel lblTelefono = new JLabel("Teléfono");
        JTextField txtTelefono = new JTextField(20);
        JLabel lblDomicilio = new JLabel("Domicilio");
        JTextField txtDomicilio = new JTextField(20);
        JLabel lblComuna = new JLabel("Comuna");
        JTextField txtComuna = new JTextField(20);
        JLabel lblCuentaSocio = new JLabel("Número Socio");
        JTextField txtCuentaSocio = new JTextField(20);


        JButton btnRegistrar = new JButton("Registrar");

        // Agregar componentes a la ventana del formulario
        formularioRegistrar.add(lblNombre);
        formularioRegistrar.add(txtNombre);
        formularioRegistrar.add(lblAppPaterno);
        formularioRegistrar.add(txtAppPaterno);
        formularioRegistrar.add(lblAppMaterno);
        formularioRegistrar.add(txtAppMaterno);
        formularioRegistrar.add(lblRut);
        formularioRegistrar.add(txtRut);
        formularioRegistrar.add(lblCorreo);
        formularioRegistrar.add(txtCorreo);
        formularioRegistrar.add(lblTelefono);
        formularioRegistrar.add(txtTelefono);
        formularioRegistrar.add(lblDomicilio);
        formularioRegistrar.add(txtDomicilio);
        formularioRegistrar.add(lblComuna);
        formularioRegistrar.add(txtComuna);
        formularioRegistrar.add(lblCuentaSocio);
        formularioRegistrar.add(txtCuentaSocio);
        formularioRegistrar.add(btnRegistrar);
        
        // Guardar los datos del formulario
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                // obtenemos los datos del form
                String rut = txtRut.getText();
                String nombre = txtNombre.getText();
                String appPaterno = txtAppPaterno.getText();
                String appMaterno = txtAppMaterno.getText();
                String correo = txtCorreo.getText();
                String telefono = txtTelefono.getText();
                String domicilio = txtDomicilio.getText();
                String comuna = txtComuna.getText();
                String cuentaSocio = txtCuentaSocio.getText();

                // validaciones
                if (!validador.rut(rut)) {
                    JOptionPane.showMessageDialog(formularioRegistrar, "El formato del RUT es incorrecto.");
                    return;
                }
                if (!validador.esSoloLetras(nombre) || !validador.esSoloLetras(appPaterno) || !validador.esSoloLetras(appMaterno)) {
                    JOptionPane.showMessageDialog(formularioRegistrar, "El nombre y los apellidos deben contener solo letras.");
                    return;
                }
                if (!validador.correoValido(correo)) {
                    JOptionPane.showMessageDialog(formularioRegistrar, "El correo debe estar en formato correcto.");
                    return;
                }
                if (domicilio.length() < 2) {
                    JOptionPane.showMessageDialog(formularioRegistrar, "El domicilio debe tener al menos dos caracteres.");
                    return;
                }
                if (!validador.telefonoValido(telefono)) {
                    JOptionPane.showMessageDialog(formularioRegistrar, "El teléfono debe tener 9 dígitos y comenzar con 9 o 2.");
                    return;
                }
                if (!validador.nroCuenta(cuentaSocio)) {
                    JOptionPane.showMessageDialog(formularioRegistrar, "Ingrese un numero de socio valido de 9 digitos.");
                    return;
                }

                // convierto telefono y cuentaSocio a int
                int telefonoInt = Integer.parseInt(telefono);
                int cuentaSocioInt = Integer.parseInt(cuentaSocio);
                
                // crear nuevo objeto con los datos ingresados
                Socio nuevoSocio = new Socio(rut, nombre, appPaterno, appMaterno, correo, domicilio, "Región", "Ciudad", comuna, telefonoInt, cuentaSocioInt);
                socios.add(nuevoSocio);
                
                JOptionPane.showMessageDialog(formularioRegistrar, "Socio registrado con éxito");
                
                // Limpiar el formulario
                txtNombre.setText("");
                txtAppPaterno.setText("");
                txtAppMaterno.setText("");
                txtRut.setText("");
                txtCorreo.setText("");
                txtTelefono.setText("");
                txtDomicilio.setText("");
                txtComuna.setText("");
                txtCuentaSocio.setText("");              
            }   
        });

        // Mostrar la ventana de registro
        formularioRegistrar.setVisible(true);
    }

    private void mostrarFormularioVerDatos() {
        JFrame formularioVerDatos = new JFrame("Ver Datos del Socio");
        formularioVerDatos.setSize(400, 300);
        formularioVerDatos.setLayout(new GridBagLayout());

        // Configurar el GridBag
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Espacio para ingresar el RUT
        gbc.gridy = 1;
        JLabel lblRut = new JLabel("Ingrese el RUT:");
        JTextField txtRutBusqueda = new JTextField(20);
        formularioVerDatos.add(lblRut, gbc);

        gbc.gridx = 1;
        formularioVerDatos.add(txtRutBusqueda, gbc);

        // Botón de búsqueda
        gbc.gridx = 0;
        gbc.gridy = 2;
        JButton btnBuscar = new JButton("Buscar");
        formularioVerDatos.add(btnBuscar, gbc);

        // Mostrar los datos
        gbc.gridy = 3;
        gbc.gridx = 0;
        JLabel lblNombre = new JLabel("Nombre:");
        formularioVerDatos.add(lblNombre, gbc);

        gbc.gridx = 1;
        JLabel lblNombreValor = new JLabel("");
        formularioVerDatos.add(lblNombreValor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        JLabel lblAppPaterno = new JLabel("Apellido Paterno:");
        formularioVerDatos.add(lblAppPaterno, gbc);

        gbc.gridx = 1;
        JLabel lblAppPaternoValor = new JLabel("");
        formularioVerDatos.add(lblAppPaternoValor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        JLabel lblAppMaterno = new JLabel("Apellido Materno:");
        formularioVerDatos.add(lblAppMaterno, gbc);

        gbc.gridx = 1;
        JLabel lblAppMaternoValor = new JLabel("");
        formularioVerDatos.add(lblAppMaternoValor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        JLabel lblCorreo = new JLabel("Correo:");
        formularioVerDatos.add(lblCorreo, gbc);

        gbc.gridx = 1;
        JLabel lblCorreoValor = new JLabel("");
        formularioVerDatos.add(lblCorreoValor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        JLabel lblTelefono = new JLabel("Teléfono:");
        formularioVerDatos.add(lblTelefono, gbc);

        gbc.gridx = 1;
        JLabel lblTelefonoValor = new JLabel("");
        formularioVerDatos.add(lblTelefonoValor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        JLabel lblDomicilio = new JLabel("Domicilio:");
        formularioVerDatos.add(lblDomicilio, gbc);

        gbc.gridx = 1;
        JLabel lblDomicilioValor = new JLabel("");
        formularioVerDatos.add(lblDomicilioValor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        JLabel lblComuna = new JLabel("Comuna:");
        formularioVerDatos.add(lblComuna, gbc);

        gbc.gridx = 1;
        JLabel lblComunaValor = new JLabel("");
        formularioVerDatos.add(lblComunaValor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        JLabel lblCuentaSocio = new JLabel("Número Socio:");
        formularioVerDatos.add(lblCuentaSocio, gbc);

        gbc.gridx = 1;
        JLabel lblCuentaSocioValor = new JLabel("");
        formularioVerDatos.add(lblCuentaSocioValor, gbc);

        // acción del botón
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String rutBuscar = txtRutBusqueda.getText();
                boolean socioEncontrado = false;

                for (Socio socio : socios) {
                    if (socio.getRut().equals(rutBuscar)) {
                        lblNombreValor.setText(socio.getNombre());
                        lblAppPaternoValor.setText(socio.getAppPaterno());
                        lblAppMaternoValor.setText(socio.getAppMaterno());
                        lblCorreoValor.setText(socio.getCorreo());
                        lblTelefonoValor.setText(String.valueOf(socio.getNumTelefono()));
                        lblDomicilioValor.setText(socio.getDomicilio());
                        lblComunaValor.setText(socio.getComuna());
                        lblCuentaSocioValor.setText(String.valueOf(socio.getCuentaSocio().getNumeroCuenta()));
                        socioEncontrado = true;
                        break;
                    }

            }
            if (!socioEncontrado) {
                JOptionPane.showMessageDialog(formularioVerDatos, "Socio no encontrado");
            }
        }});

        formularioVerDatos.setVisible(true);
    }

    private void mostrarFormularioPagarCuota(){
        JFrame formularioPagarCuota = new JFrame("Pagar Cuota Mensual");
        formularioPagarCuota.setSize(500, 600);
        formularioPagarCuota.setLayout(new GridLayout(10, 1));
        
        JLabel lblRut = new JLabel("RUT (12.345.678-9)");
        JTextField txtRut = new JTextField(20);
        JLabel lblMontoCuota = new JLabel("Monto Cuota");
        JTextField txtMontoCuota = new JTextField(20);
        JLabel lblNumCuota= new JLabel("Número Cuota");
        JTextField txtNumCuota = new JTextField(20);
        
        
        JButton btnBuscarSocio = new JButton("BUSCAR");
        JButton btnPagar = new JButton("PAGAR");
        
        // Agregar componentes a la ventana del formulario
        formularioPagarCuota.add(lblRut);
        formularioPagarCuota.add(txtRut);
        formularioPagarCuota.add(btnBuscarSocio);
        formularioPagarCuota.add(lblMontoCuota);
        formularioPagarCuota.add(txtMontoCuota);
        
        formularioPagarCuota.add(lblNumCuota);
        formularioPagarCuota.add(txtNumCuota);
        txtNumCuota.setEditable(false);
        txtMontoCuota.setEditable(false);
        formularioPagarCuota.add(btnPagar);
        btnPagar.setEnabled(false);
        // Buscar el socio para cancelar la cuota
        btnBuscarSocio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String rutBuscar = txtRut.getText();
                
                boolean socioEncontrado = false;

                for (Socio socio : socios) {
                    if (socio.getRut().equals(rutBuscar)) {
                        int numeroCuota = socio.getCuentaSocio().getNumCuota();
                        if(numeroCuota >11){
                            btnPagar.setEnabled(false);
                        }
                        else{
                            btnPagar.setEnabled(true);
                        }
                        txtMontoCuota.setText(String.valueOf(socio.getCuentaSocio().getValorCuota()));
                        txtNumCuota.setText(String.valueOf(numeroCuota));
                        
                        socioEncontrado = true;
                        break;
                    }

            }
            if (!socioEncontrado) {
                JOptionPane.showMessageDialog(formularioPagarCuota, "Socio no encontrado");
            }
            }
        });
        // Buscar el socio para cancelar la cuota
        btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rutBuscar = txtRut.getText();
                int montoCuotaPagar = Integer.valueOf(txtMontoCuota.getText());                
                boolean socioEncontrado = false;
                
                for (Socio socio : socios) {
                    if (socio.getRut().equals(rutBuscar)) {
                        
                        socio.getCuentaSocio().pagarVent(montoCuotaPagar);
                        txtMontoCuota.setText(String.valueOf(socio.getCuentaSocio().getValorCuota()));
                        int numeroCuota = socio.getCuentaSocio().getNumCuota();
                        txtNumCuota.setText(String.valueOf(numeroCuota));
                        if(numeroCuota>11){
                            btnPagar.setEnabled(false);
                        }
                        socioEncontrado = true;
                        break;
                    }
                    
                }
                if (!socioEncontrado) {
                    JOptionPane.showMessageDialog(formularioPagarCuota, "Socio no encontrado");
                }
            }
        });
        // Mostrar la ventana de registro
        formularioPagarCuota.setVisible(true);
    }

    private void mostrarFormularioCuotaCancelada() {
        // Crear la ventana para consultar el monto total cancelado
        JFrame formularioCuotaCancelada = new JFrame("Consultar Monto Total Cancelado");
        formularioCuotaCancelada.setSize(400, 200);
        formularioCuotaCancelada.setLayout(new GridBagLayout());
    
        // Configurar el GridBag
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
    
        // Espacio para ingresar el RUT
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel lblRut = new JLabel("Ingrese el RUT:");
        formularioCuotaCancelada.add(lblRut, gbc);
    
        gbc.gridx = 1;
        JTextField txtRutBusqueda = new JTextField(20);
        formularioCuotaCancelada.add(txtRutBusqueda, gbc);
    
        // Botón de búsqueda
        gbc.gridx = 0;
        gbc.gridy = 1;
        JButton btnBuscar = new JButton("Buscar");
        formularioCuotaCancelada.add(btnBuscar, gbc);
    
        // Etiqueta para mostrar el monto total cancelado
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel lblCuotaCancelada = new JLabel("Monto Total Cancelado:");
        formularioCuotaCancelada.add(lblCuotaCancelada, gbc);
    
        // Valor del monto total cancelado
        gbc.gridx = 1;
        JLabel lblCuotaCanceladaValor = new JLabel("");
        formularioCuotaCancelada.add(lblCuotaCanceladaValor, gbc);
    
        // Acción del botón de búsqueda
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rutBuscar = txtRutBusqueda.getText();
                boolean socioEncontrado = false;
    
                for (Socio socio : socios) {
                    if (socio.getRut().equals(rutBuscar)) {
                        // Mostrar el monto total cancelado del socio encontrado
                        lblCuotaCanceladaValor.setText(String.valueOf(socio.getCuentaSocio().getCantAportada()));
                        socioEncontrado = true;
                        break;
                    }
                }
                if (!socioEncontrado) {
                    JOptionPane.showMessageDialog(formularioCuotaCancelada, "Socio no encontrado");
                }
            }
        });
    
        formularioCuotaCancelada.setVisible(true);
    }

    private void mostrarFormularioPorPagar() {
        // Crear la ventana para consultar cuotas por pagar
        JFrame formularioPorPagar = new JFrame("Consultar Cuotas Por Pagar");
        formularioPorPagar.setSize(400, 200);
        formularioPorPagar.setLayout(new GridBagLayout());
    
        // Configurar el GridBag
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
    
        // Espacio para ingresar el RUT
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel lblRut = new JLabel("Ingrese el RUT:");
        formularioPorPagar.add(lblRut, gbc);
    
        gbc.gridx = 1;
        JTextField txtRutBusqueda = new JTextField(20);
        formularioPorPagar.add(txtRutBusqueda, gbc);
    
        // Botón de búsqueda
        gbc.gridx = 0;
        gbc.gridy = 1;
        JButton btnBuscar = new JButton("Buscar");
        formularioPorPagar.add(btnBuscar, gbc);
    
        // Etiqueta para mostrar el total de cuotas por pagar
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel lblPorPagar = new JLabel("Cuotas Por Pagar:");
        formularioPorPagar.add(lblPorPagar, gbc);
    
        // Valor del total de cuotas pagadas
        gbc.gridx = 1;
        JLabel lblPorPagarValor = new JLabel("");
        formularioPorPagar.add(lblPorPagarValor, gbc);
    
        // Acción del botón de búsqueda
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rutBuscar = txtRutBusqueda.getText();
                boolean socioEncontrado = false;
    
                for (Socio socio : socios) {
                    if (socio.getRut().equals(rutBuscar)) {
                        // Mostrar las cuotas por pagar
                        lblPorPagarValor.setText(String.valueOf(12 - (socio.getCuentaSocio().getNumCuota())));
                        socioEncontrado = true;
                        break;
                    }
                }
                if (!socioEncontrado) {
                    JOptionPane.showMessageDialog(formularioPorPagar, "Socio no encontrado");
                }
            }
        });
    
        formularioPorPagar.setVisible(true);
    }
    
    


    public static void main(String[] args) {
        // Crear y mostrar la ventana principal
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}
