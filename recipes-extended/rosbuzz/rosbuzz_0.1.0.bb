DESCRIPTION = "ROS package for BUZZ programming language."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;md5=b18227f996fd8967f686234797145565"

DEPENDS = "roscpp std-msgs mavros-msgs sensor-msgs message-generation"
RDEPENDS_${PN} = "roscpp std-msgs mavros-msgs sensor-msgs message-runtime"

SRC_URI = "file://rosbuzz-0.1.0.tar.gz"

S = "${WORKDIR}/rosbuzz-0.1.0"

inherit catkin

EXTRA_OECMAKE = ""
