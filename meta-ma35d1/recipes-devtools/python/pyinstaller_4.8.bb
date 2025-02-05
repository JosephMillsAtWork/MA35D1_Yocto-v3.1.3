SUMMARY = " pyinstaller_4.8 "

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=752110777ecd9e72b16df0e59c1e0019"

inherit native pypi setuptools3 python3native

DEPENDS:append = " python3-wheel-native"

SRCREV= "fcff15e6e7ab6fad135c584c2b6cc5e0f7809319"

SRC_URI = "git://github.com/pyinstaller/pyinstaller.git;protocol=https;branch=v4"
S = "${WORKDIR}/git"
B =  "${WORKDIR}/build"

BBCLASSEXTEND = "native nativesdk"

INHIBIT_SYSROOT_STRIP = "1"
INSANK_SKIP_${PN}_append = "already-stripped"
