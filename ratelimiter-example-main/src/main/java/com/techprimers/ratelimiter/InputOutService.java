package com.techprimers.ratelimiter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class InputOutService {

	@Autowired
	InputOutPutRepo inputOut;
	public ResponseEntity<List<InOutDto>> getResponseId(InOutDto out) {
		int responseId=0;
		// TODO Auto-generated method stub
		System.out.println(responseId);
		return inputOut.GetOutPutResponse(out, responseId);
	}

}
