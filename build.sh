#!/bin/bash
source ./env.bash
./configure clean
./configure OBJCOPY=gobjcopy --with-debug-level=slowdebug --enable-debug-symbols ZIP_DEBUGINFO_FILES=0 
make CONF=macosx-x86_64-normal-server-slowdebug