# 语言选项
export LANG=C
export CC=clang
# 警告看作错误
export COMPILER_WARNINGS_FATAL=false
export LFLAGS='-Xlinker -lstdc++'
export USE_CLANG=true
export LP64=1
# 64位
export ARCH_DATA_MODEL=64
# 运行自动下载依赖
export ALLOW_DOWNLOADS=true
# 四个线程并发编译
export HOTSPOT_BUILD_JOBS=8
# export ALT_PARALLEL_COMPILE_JOBS=4
# 不比较镜像差异
export SKIP_COMPARE_IMAGES=true
# 使用预编译头
export USE_PRECOMPILED_HEADER=true

export INCREMENTAL_BUILD=true
# 需要编译的内容
export BUILD_LANGTOOLS=true
export BUILD_JAXP=true
export BUILD_JAXWS=true
export BUILD_CORBA=true
export BUILD_HOTSPOT=true
export BUILD_JDK=true
# 要编译的版本
export SKIP_DEBUG_BUILD=false
export SKIP_FASTDEBUG_BUILD=true
export DEBUG_NAME=debug
export BUILD_DEPLOY=false
# 不生成安装文件
export BUILD_INSTALL=false

# 调试用
# export OBJCOPY=gobjcopy

# 你的bootstrap jdk的地址，得比当前版本低
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home

export JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF-8
# unset JAVA_HOME
unset CLASSPATH
# unset ALT_ environment
