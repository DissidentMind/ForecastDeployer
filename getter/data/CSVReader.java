package forecast.getter.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import forecast.utils.metrics.MetricsPerformaceForecast;

public class CSVReader {
	
	final static public List<String> dataSourceList = Arrays.asList(
			"http://www.pronosticos.gob.mx/Documentos/Historicos/Melate.csv",
			"http://www.pronosticos.gob.mx/Documentos/Historicos/Revancha.csv",
			"http://www.pronosticos.gob.mx/Documentos/Historicos/Revanchita.csv");
	
	public static void main(String args[]) throws IOException{

		MetricsPerformaceForecast mPerform = new MetricsPerformaceForecast();
		mPerform.setStartExecutionTime(System.nanoTime());
		
		for(int i = 0; i<dataSourceList.size();i++){
			CSVReader csvR = new CSVReader();		
					csvR.readDataURL(dataSourceList.get(i));
		System.out.println("--------------------------------------------------------");
		}
		
		mPerform.setEndExecutionTime(System.nanoTime());
		System.out.println("Elapsed Getting Data Time: "+mPerform.elapsedExecutionTime(mPerform.getStartExecutionTime(), mPerform.getEndExecutionTime()));
		
	}

	public void readDataURL(String file) throws MalformedURLException, IOException{
		
		try (InputStream is = new URL(file).openConnection().getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		
			Stream<String> streamGet = reader.lines()) {
			//Pattern.compile(",").splitAsStream((CharSequence) streamGet);
			streamGet.forEach(System.out::println);
			
			}catch(IOException ei){
				 System.out.println("Not Stream Available");
			}
	}
}
