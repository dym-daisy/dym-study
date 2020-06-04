package com.dym.hadoop.example;

import org.apache.hadoop.mapreduce.Partitioner;

public class TPartiitioner extends Partitioner {
    @Override
    public int getPartition(Object o, Object o2, int numPartitions) {
        return 0;
    }
}
