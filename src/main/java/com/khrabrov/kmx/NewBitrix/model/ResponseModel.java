package com.khrabrov.kmx.NewBitrix.model;

import java.util.List;

public class ResponseModel {
    private final int counter;
    private final List<BlockModel> blocksList;


    public ResponseModel(int counter, List<BlockModel> blocksList) {
        this.counter = counter;
        this.blocksList = blocksList;
    }

    public int getCounter() {
        return counter;
    }

    public List<BlockModel> getBlockModels() {
        return blocksList;
    }
}
