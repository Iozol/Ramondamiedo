import java.util.Scanner;

public class Ejercicio031 {

    public static void main(String[] args) {

        // las variables lin y len contienen la muletilla del idioma, la 
variable st tiene el resultado final que se muestra en pantalla.
        String lin = "javalin, javalon", len = "javalen, len, len", st;

        // bo se pondrá true solo cuando se sepa seguro que es el idioma 
correcto
        boolean bo = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Habla o calla para siempre");
        st = sc.nextLine();
        System.out.println();

        if (st.startsWith(lin)) {
            // este if se encarga de mirar si el prefijo de la variable 
lin es igual a la primera palabra de st.

            if (st.endsWith(len)) {
                // en caso de que el if anterior de verdadero mirará si 
realmente es el idioma comparando la última palabra con la coletilla de 
la variable len ya que o tienen el prefijo o tienen la coletilla pero no 
ambas.
                System.out.println("Wow eso ha sido jav... no espera, 
casi me la cuelas");
                System.exit(0);
            } else {
                // en caso de que no coincidan bo pasará a ser true y se 
borrara el prefijo a la variable st
                bo = true;
                st = st.substring(lin.length());
            }

        } else {
            // en el caso de que el primer if sea false se mirará si las 
ultimas palabras de st counciden con la coletilla de la variable len, en 
caso verdadero bo pasa a ser verdadero y se le quitará la coletilla a la 
palabra
            if (st.endsWith(len)) {
                bo = true;
                st = st.substring(0, st.length() - len.length());
            }
        }

        // en el caso de que bo sea verdadero sacará el mensaje 
correspondiente a este y mostrará la variable st sin espacios ya sean 
delante o detras de la frase. en caso contrario mostrara mensaje 
diferente
        if (bo) {
            System.out.println("¡¡Wow eso ha sido javalandes!! la 
traduccion es '" + st.trim() + "'");
        } else {
            System.out.println("¡Bah! " + st + " no es javalandes");
        }

    }//clocreta :3
	
}
