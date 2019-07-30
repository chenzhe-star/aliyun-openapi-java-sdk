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

package com.aliyuncs.csb.model.v20171118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.csb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CommitSuccessedServicesRequest extends RpcAcsRequest<CommitSuccessedServicesResponse> {
	
	public CommitSuccessedServicesRequest() {
		super("CSB", "2017-11-18", "CommitSuccessedServices");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String csbName;

	private String services;

	public String getCsbName() {
		return this.csbName;
	}

	public void setCsbName(String csbName) {
		this.csbName = csbName;
		if(csbName != null){
			putQueryParameter("CsbName", csbName);
		}
	}

	public String getServices() {
		return this.services;
	}

	public void setServices(String services) {
		this.services = services;
		if(services != null){
			putBodyParameter("Services", services);
		}
	}

	@Override
	public Class<CommitSuccessedServicesResponse> getResponseClass() {
		return CommitSuccessedServicesResponse.class;
	}

}
