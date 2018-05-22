package forecast.utils.metrics;

public class MetricsPerformaceForecast {

	public long getStartExecutionTime() {
		return startExecutionTime;
	}

	public void setStartExecutionTime(long startExecutionTime) {
		//System.nanoTime()
		this.startExecutionTime = startExecutionTime;
	}

	public long getEndExecutionTime() {
		return endExecutionTime;
	}

	public void setEndExecutionTime(long endExecutionTime) {
		this.endExecutionTime = endExecutionTime;
	}

	long startExecutionTime = 0;
	long endExecutionTime = 0;
	
	public long elapsedExecutionTime(long startExecutionTime, long endExecutionTime){
		//Segundos: ((endExecutionTime-startExecutionTime)/1000000)/1000
		return ((endExecutionTime-startExecutionTime)/1000000);
	}
}
