package com.deltabook.model.send;

import com.deltabook.model.Message;

import java.util.List;

public class JsonResponse {
        private String status;
        private Object data;

        public JsonResponse(){

        }

        public JsonResponse(String status, Object data){
            this.status = status;
            this.data = data;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }
}
