package com.dispatch.entity;

import com.dispatch.constants.ManitouConstants;

public class Response {
 
	/**
	 * added by Vivek Kumar. response pojo used for bussness logic
	 */
 
		private static final long serialVersionUID = -8091879091924046844L;
		
		private String status;
		private String statusCode;
		private String errorMsg;
	    private Object data;
		
		public Response() {
			super();
		}
		
		public static Response ok(Object data) {
			return new Response(ManitouConstants.SUCCESS,ManitouConstants.SUCCESS_CODE,data);
		}
		public static Response ok() {
			return new Response(ManitouConstants.SUCCESS,ManitouConstants.SUCCESS_CODE,null);
		}

		public static Response error(String errorMsg) {
			return new Response(ManitouConstants.FAILURE,ManitouConstants.ERROR_CODE,errorMsg);
		}
		


		
		public Response(String status, String statusCode, Object data) {
			super();
			this.status = status;
			this.statusCode = statusCode;
			this.data = data;
		}
		
		public Response(String status, String statusCode, String errorMsg) {
			super();
			this.status = status;
			this.statusCode = statusCode;
			this.errorMsg = errorMsg;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusCode() {
			return statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public String getErrorMsg() {
			return errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Response [status=" + status + ", statusCode=" + statusCode + ", errorMsg=" + errorMsg + ", data=" + data
					+ "]";
		}
		


		



 
}
