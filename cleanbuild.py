#!/usr/bin/python
# coding=utf-8
import zipfile
import shutil
import os
import os.path
import time
import datetime
import sys

import socket
 

def cleanbuild():
    listdir = ["AppCommon/launcher/build","AppCommon/LibCommon/build","AppCommon/imageselector/build","AppCommon/.idea"]
    for dir in listdir:
        flag = os.path.exists(dir)
        if flag: 
            shutil.rmtree(dir) 
 
# 主函数的实现
if __name__ == "__main__":

    cleanbuild() 

    print("cleanbuild end")
