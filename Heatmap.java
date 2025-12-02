import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Heatmap {
	private double[][] data;
	public Heatmap(int rows, int cols, String filename) throws IOException
	{
	File file = new File(filename);
	Scanner sc = new Scanner(file);
	double[][] d = new double[rows][cols];
	int i = 0;
	int j = 0;
	String[] s;
	while (sc.hasNextLine())
	{
		s = (sc.nextLine().split(","));
		for(int q = 0; q < d[j].length; q++) {
			for(int w = 0; w < d[j].length; w++) {
				d[q][w] = Double.parseDouble(s[q]);
			}
			data = d;
			i++;
			if (i > cols)
			{
				i = 0;
				j++;
			}
		}
		data = d;
	}
}
	public void printHeatmap()
	{
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				System.out.println(data[i][j]);
			}
		}
	}
	public double sumHeatmap()
	{
		double sum = 0;
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				sum += data[i][j];
			}
		}
		return sum;
	}
	public double avgHeatmap()
	{
		double av = 0;
		for (int i = 0; i < data.length - 1; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				av += data[i][j];
			}
		}
		av /= data.length * data[0].length;
		return av;
	}
	public double sumColumn(int col)
	{
		double sum = 0;
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				if (i == col)
				{
					sum += data[i][j];
				}
			}
		}
		return sum;
	}
	public double sumRow(int row)
	{
		int sum = 0;
		for (int i = 0; i < data[row].length; i++)
		{
			sum += data[row][i];
		}
		return sum;
	}
	public int areCold()
	{
		int count = 0;
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				if (data[i][j] < 10)
				{
					count++;
				}
			}
		}
		return count;
	}
}
