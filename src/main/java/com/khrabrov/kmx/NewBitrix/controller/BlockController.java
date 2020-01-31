package com.khrabrov.kmx.NewBitrix.controller;

import com.khrabrov.kmx.NewBitrix.model.BlockModel;
import com.khrabrov.kmx.NewBitrix.model.ResponseModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BlockController {
    BlockModel blockModel1 = new BlockModel(
            "./images/app/app1.jpg",
            "Paralax",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                    " Integer tellus lacus, dictum eget libero fringilla, ornare volutpat neque volutpat.");

    BlockModel blockModel2 = new BlockModel(
            "./images/app/app2.jpg",
            "Scroll",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Integer tellus lacus, dictum eget libero fringilla, ornare volutpat neque volutpat.");

    BlockModel blockModel3 = new BlockModel(
            "./images/app/app3.jpg",
            "Pre-loader",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Integer tellus lacus, dictum eget libero fringilla, ornare volutpat neque volutpat.");

    @GetMapping("/blocks")
    public ResponseModel responseBlockModel() {
        List<BlockModel> blocksList = new ArrayList<>();

        blocksList.add(blockModel1);
        blocksList.add(blockModel2);
        blocksList.add(blockModel3);

        return new ResponseModel(blocksList.size(), blocksList);
    }
}
