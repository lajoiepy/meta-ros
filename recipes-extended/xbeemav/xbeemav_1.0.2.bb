DESCRIPTION = "ROS package for XBee."
LICENSE = "BSL"
LIC_FILES_CHKSUM = "file://package.xml;md5=2a3c3d052a7babce3d69b28c628f845b"

DEPENDS = "roscpp std-msgs"
RDEPENDS_${PN} = "roscpp std-msgs"

SRC_URI = "file://xbeemav-1.0.2.tar.gz"

S = "${WORKDIR}/xbeemav-${PV}"

inherit catkin

EXTRA_OECMAKE = ""
