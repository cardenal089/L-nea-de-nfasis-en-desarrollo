import java.io.*;

public class Ejercicio3 {
	public static void main(String[] args) {
		String resultado = "";
		File archivo = new File("C:\\Users\\Emisiones\\Documents\\ejercicio3.csv");
		try{
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String[] cadena1=br.readLine().split(";");
			String[] cadena2=br.readLine().split(";");
			for(int i=0;i<cadena1.length-1;i++){
				resultado=resultado+(Integer.parseInt(cadena1[i])+Integer.parseInt(cadena2[i]))+";";
			}
			resultado=resultado+"Resultado suma";
			System.out.println(resultado);
			br.close();
			fr.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileWriter fw = new FileWriter(archivo,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(resultado);
			bw.close();
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
