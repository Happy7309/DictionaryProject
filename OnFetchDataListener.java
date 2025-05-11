package com.example.MyProject1;

import java.util.List;

public interface OnFetchDataListener {
    void onFetchData(APIResponce apiresponce, String message);
    void onError(String message);
}
