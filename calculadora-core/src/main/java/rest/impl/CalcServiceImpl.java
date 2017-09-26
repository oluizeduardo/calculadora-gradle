package rest.impl;

import rest.api.CalcService;
import rest.api.Result;

public class CalcServiceImpl implements CalcService {

	
	
	@Override
	public Result soma(int a, int b) {
		
		int result = a + b;
		return new Result().withA(a).withB(b).withValue(result);
	}

	
	@Override
	public Result subtrai(int a, int b) {
		
		int result = a - b;
		return new Result().withA(a).withB(b).withValue(result);
	}
	
	
	
}
