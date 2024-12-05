#!/bin/bash
ps -ef | grep "/opt/ghgl/redis-stack-server-7.2.0-v11/bin/redis-server" | grep -v grep | grep "15379"  |awk '{printf $2}' |xargs kill -9

