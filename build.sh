#!/bin/bash
source ./env.bash
./configure clean
./configure
make all