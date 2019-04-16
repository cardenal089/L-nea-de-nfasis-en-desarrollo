import java.io.*;


public class Ejercicio2 {
	public static void main(String[] args) {
		String resultado="";
		File archivo = new File("C:\\Users\\Emisiones\\Documents\\ejercicio2.txt");
		try {
			FileReader fr=new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			
			String linea=br.readLine();
			String[]cadena1 = linea.split(";");
			String[] cadena1f=cadena1[0].split(",");
			
			linea=br.readLine();
			String[]cadena2 = linea.split(";");
			String[] cadena2f=cadena2[0].split(",");
			
			br.close();
			fr.close();
			
			int a=cadena1f.length;
			int[] c=new int[a];
			resultado="";
			for(int i=0;i<a;i++){
				c[i]=Integer.parseInt(cadena1f[i])+Integer.parseInt(cadena2f[i]);
				resultado=resultado+c[i]+" , ";
			}
			resultado=resultado.substring(0,resultado.length()-2);
			System.out.print(resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			FileWriter fw = new FileWriter(archivo,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write("-----------------------------------------------------");
			bw.newLine();
			bw.write(resultado);
			bw.close();
			fw.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
}
