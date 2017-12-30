package com.itparsa.parcelerissue.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by itparsa on 12/26/17.
 */
@Parcel
public class BaseResponse<resultModel> {
    @SerializedName("status")
    public String status;
    @SerializedName("message")
    public String message;
    @SerializedName("result")
    public resultModel result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public resultModel getResult() {
        return result;
    }

    public void setResult(resultModel result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseResponse)) return false;

        BaseResponse<?> that = (BaseResponse<?>) o;

        if (getStatus() != null ? !getStatus().equals(that.getStatus()) : that.getStatus() != null)
            return false;
        if (getMessage() != null ? !getMessage().equals(that.getMessage()) : that.getMessage() != null)
            return false;
        return getResult() != null ? getResult().equals(that.getResult()) : that.getResult() == null;
    }

    @Override
    public int hashCode() {
        int result1 = getStatus() != null ? getStatus().hashCode() : 0;
        result1 = 31 * result1 + (getMessage() != null ? getMessage().hashCode() : 0);
        result1 = 31 * result1 + (getResult() != null ? getResult().hashCode() : 0);
        return result1;
    }
}
