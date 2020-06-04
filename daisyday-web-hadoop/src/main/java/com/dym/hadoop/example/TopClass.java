package com.dym.hadoop.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

import java.io.IOException;

public class TopClass {
    public static void main(String[] args) throws Exception {
        //配置
        Configuration conf=new Configuration(true);
        String[] other = new GenericOptionsParser(conf, args).getRemainingArgs();
        Job job= Job.getInstance(conf);
        job.setJarByClass(TopClass.class);
        job.setJobName("TopClass");


        TextInputFormat.addInputPath(job,new Path(other[0]));


        Path outPath=new Path(other[1]);

        if(outPath.getFileSystem(conf).exists(outPath)){
            outPath.getFileSystem(conf).delete(outPath,true);
        }

        TextOutputFormat.setOutputPath(job,outPath);

        //key
        //map
        job.setMapperClass(TMapper.class);
        job.setMapOutputKeyClass(TKey.class);
        job.setMapOutputValueClass(IntWritable.class);
        //分区器 年月分区

        job.setPartitionerClass(TPartiitioner.class);
        //排序类 年，月，温度 温度倒序
        job.setSortComparatorClass(TSortComparator.class);



        //reducetask



        /**
         * Submit the job to the cluster and wait for it to finish.
         * @param verbose print the progress to the user
         * @return true if the job succeeded
         * @throws IOException thrown if the communication with the
         *         <code>JobTracker</code> is lost
         */
        job.waitForCompletion(true);



    }
}
