/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.onsmqtt.transform.v20191211;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.onsmqtt.model.v20191211.BatchSendMessagesResponse;
import com.aliyuncs.onsmqtt.model.v20191211.BatchSendMessagesResponse.ResponsesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchSendMessagesResponseUnmarshaller {

	public static BatchSendMessagesResponse unmarshall(BatchSendMessagesResponse batchSendMessagesResponse, UnmarshallerContext _ctx) {
		
		batchSendMessagesResponse.setRequestId(_ctx.stringValue("BatchSendMessagesResponse.RequestId"));

		List<ResponsesItem> responses = new ArrayList<ResponsesItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchSendMessagesResponse.Responses.Length"); i++) {
			ResponsesItem responsesItem = new ResponsesItem();
			responsesItem.setId(_ctx.integerValue("BatchSendMessagesResponse.Responses["+ i +"].Id"));
			responsesItem.setMsgId(_ctx.stringValue("BatchSendMessagesResponse.Responses["+ i +"].MsgId"));
			responsesItem.setErrorCode(_ctx.integerValue("BatchSendMessagesResponse.Responses["+ i +"].ErrorCode"));
			responsesItem.setErrorMessage(_ctx.stringValue("BatchSendMessagesResponse.Responses["+ i +"].ErrorMessage"));

			responses.add(responsesItem);
		}
		batchSendMessagesResponse.setResponses(responses);
	 
	 	return batchSendMessagesResponse;
	}
}