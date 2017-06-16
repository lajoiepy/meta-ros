DESCRIPTION = "ROS package for XBee."
LICENSE = "BSL"
LIC_FILES_CHKSUM = "file://package.xml;md5=d91b46a600ec938a7dc7c000ed51cfd7"

DEPENDS = "roscpp std-msgs"
RDEPENDS_${PN} = "roscpp std-msgs"

SRC_URI = "file://xbeemav1.0.2.tar.gz"

S = "${WORKDIR}/xbeemav-${PV}/xbeemav"

inherit catkin

EXTRA_OECMAKE = ""
