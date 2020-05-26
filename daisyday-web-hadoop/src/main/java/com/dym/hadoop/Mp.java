package com.dym.hadoop;


import javafx.scene.text.Text;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import java.io.IOException;

public class Mp {
    public static void main(String[] args) throws IOException {
        Configuration conf=new Configuration(true);
        Job job= Job.getInstance(conf);
        job.setJarByClass(Mp.class);
        // Specify various job-specific parameters
        job.setJobName("myjob");
        Path inputPath = new Path("/data/wc/input");
        TextInputFormat.addInputPath(job,inputPath);
        Path outputPath = new Path("/data/wc/input");
        if(outputPath.getFileSystem(conf).exists(outputPath)){
            outputPath.getFileSystem(conf).delete(outputPath);
        }

        TextOutputFormat.setOutputPath(job,new Path("/data/wc/input"));

        job.setMapperClass(MyMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);
        job.setReducerClass(MyReducer.class);

        // Submit the job, then poll for progress until the job is complete
//        job.waitForCompletion(true);


    }


}
