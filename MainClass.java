package com.cts.sample;

public class MainClass {
// narayana1 modified
	//narayana 
	public static void main(String[] args) {

		FlatFileItemReader itr = new FlatFileItemReader();
		itr.setCount(10);
		itr.setLineMapper(new DefaultLineMapper() {
			{
				setLineTokenizer();
			}
//this is just for understaning

		});

	}
}
