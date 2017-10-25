import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivoTextoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
File arquivoCSV = new File("participantes.csv"); // Caminho do arquivo
		
		try	{
			
			String lineCsv = new String();//Guarda linha do arquivo
			Scanner reader = new Scanner(arquivoCSV);// Le o arquivo
			
			//hasNext percorre todo arquivo
			while(reader.hasNext())
			{
				lineCsv = reader.nextLine(); // armazena na variavel lineCsv	
				System.out.println(lineCsv); // mostra arquivos
			}
		
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		

	}

}
}
