package com.mozu.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiError {
	
	protected String applicationName;

    protected List<AdditionalErrorData> additionalErrorData;
	
	protected String errorCode;
	
	protected String message;
	
	protected ExceptionDetail exceptionDetail;
	
	protected List<Item> items; 
	
	protected String correlationId; 
	
	static public class ExceptionDetail {
		protected String message;
		
		protected String source;
		
		protected String stackTrace;
		
		protected String targetSite;
		
		protected String type;
		
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getStackTrace() {
			return stackTrace;
		}
		public void setStackTrace(String stackTrace) {
			this.stackTrace = stackTrace;
		}
		public String getTargetSite() {
			return targetSite;
		}
		public void setTargetSite(String targetSite) {
			this.targetSite = targetSite;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		
	}
	
    static public class AdditionalErrorData
    {
    	public String name;
        public String value;
    	
    	public AdditionalErrorData () {
    		
    	}
    	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
    	
    }

    static public class Item
    {
        private List<AdditionalErrorData> additionalErrorData;
    	
        private String applicationName;
    	
        private String errorCode;
    	
        private String message;

        public List<AdditionalErrorData> getAdditionalErrorData() {
            return additionalErrorData;
        }

        public void setApplicationErrors(List<AdditionalErrorData> applicationErrors) {
            this.additionalErrorData = applicationErrors;
        }

        public String getApplicationName() {
            return applicationName;
        }

        public void setApplicationName(String applicationName) {
            this.applicationName = applicationName;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

	public ApiError() {
		this.exceptionDetail = new ExceptionDetail();
	}
	
	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ExceptionDetail getExceptionDetail() {
		return exceptionDetail;
	}

	public void setExceptionDetail(ExceptionDetail exceptionDetail) {
		this.exceptionDetail = exceptionDetail;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

    public List<AdditionalErrorData> getAdditionalErrorData() {
       return additionalErrorData;
    }

    public void setAdditionalErrorData(List<AdditionalErrorData> additionalErrorData) {
        this.additionalErrorData = additionalErrorData;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }
	
}


