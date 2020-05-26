package com.dym.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;

public class TestDfs {


    public Configuration conf=null;
    public FileSystem fs=null;


    @Before
    public void  corn() throws Exception {
        conf=new Configuration(true);
//        fs=FileSystem.get(conf);
        fs=FileSystem.get(URI.create("hdfs://mycluster"),conf,"dym");
    }


    @Test
    public void mkdir() throws IOException {
        Path path=new Path("/java");
        if(fs.exists(path)){
            fs.delete(path,true);
        }
        fs.create(path);
    }

    @Test
    public void upload() throws Exception {
        Path path=new Path("/java/hello.txt");

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(new File("hello.txt")));

        FSDataOutputStream outputStream = fs.create(path);

        IOUtils.copyBytes(inputStream,outputStream,conf,true);
    }


    @Test
    public void blocks() throws Exception {
        Path path=new Path("/hadoop-2.6.5.tar.gz");
        FileStatus fileStatus = fs.getFileStatus(path);
        BlockLocation[] fileBlockLocations = fs.getFileBlockLocations(path, 0, fileStatus.getLen());
        for (BlockLocation b:fileBlockLocations) {
            System.out.println(b);
        }


        long accessTime = fileStatus.getAccessTime();
        String group = fileStatus.getGroup();
        long blockSize = fileStatus.getBlockSize();
        fileStatus.getLen();


    }

    @After
    public void close() throws IOException {
            fs.close();
    }
}
