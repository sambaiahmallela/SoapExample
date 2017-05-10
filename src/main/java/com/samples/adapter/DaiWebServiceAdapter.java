package com.samples.adapter;

import java.util.List;

import com.samples.domain.DAIOptions;
import com.samples.service.response.DAIResponse;
import com.samples.service.response.DAIResponses;

public interface DaiWebServiceAdapter {

	public DAIResponse convertToDaiWebResponse(DAIOptions daiOptions, DAIResponses daiResponse);

	public DAIResponses convertToDaiWebResponse(List<DAIOptions> daiOptionsList);
}
