package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
    @Before
    public void abrirNavegador() {
        System.out.println("Se abre el navegador");
    }

    @After
    public void cerrarSesion() {
        System.out.println("Se cierra la sesión");
    }

}
