import java.util.*;
public class enumerado {

   enum Lenguajes{

		JAVAScript(".Js"),PHP(".PhP"), PYTHON(".PY"), JAVA(".Java");

		private Lenguajes(String Extension){
			this.Extension = Extension;
		}
        public String Ext(){
			return Extension;
			}

		private String Extension;
		}
       public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		System.out.println("Escriba lenguaje para ver su extension: JAVAScript, PhP, PYTHON, JAVA. \n");
		String inp = in.next().toUpperCase();

		Lenguajes len=Enum.valueOf(Lenguajes.class,inp);

		System.out.println("Lenguaje :"+len);
		System.out.println("Extension: "+len.Ext());

		}
}