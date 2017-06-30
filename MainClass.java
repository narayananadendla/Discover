package com.cts.sample;

public class MainClass {

	public static void main(String[] args) {

		FlatFileItemReader itr = new FlatFileItemReader();
		itr.setCount(10);
		itr.setLineMapper(new DefaultLineMapper() {
			{
				setLineTokenizer();
			}

		});

	}
}
