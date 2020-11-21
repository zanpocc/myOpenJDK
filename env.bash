export LANG=C
export CC=clang
# 警告看作错误
export COMPILER_WARNINGS_FATAL=false
export LFLAGS='-Xlinker -lstdc++'
export USE_CLANG=true
export LP64=1
# 64位
export ARCH_DATA_MODEL=64
export ALLOW_DOWNLOADS=true
# 四个线程并发
export HOTSPOT_BUILD_JOBS=4
export ALT_PARALLEL_COMPILE_JOBS=4
export SKIP_COMPARE_IMAGES=true
export USE_PRECOMPILED_HEADER=true
export INCREMENTAL_BUILD=true
export BUILD_LANGTOOLS=true
export BUILD_JAXP=true
export BUILD_JAXWS=true
export BUILD_CORBA=true
export BUILD_HOTSPOT=true
export BUILD_JDK=true
export SKIP_DEBUG_BUILD=true
# 跳过快速调试版本的构建
export SKIP_FASTDEBUG_BUILD=false
export DEBUG_NAME=debug
export BUILD_DEPLOY=false
export BUILD_INSTALL=false
# 你的bootstrap jdk的地址，得比当前版本低
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home

# unset JAVA_HOME
unset CLASSPATH
# unset ALT_ environment
