DESCRIPTION = "ROS package for XBee."
LICENSE = "BSL"

DEPENDS = "roscpp std_msgs"
RDEPENDS_${PN} = "roscpp std_msgs"

SRC_URI = "https://github.com/MISTLab/XbeeMav/archive/${PV}.tar.gz"

S = "${WORKDIR}/xbeemav-${PV}/xbeemav"

inherit catkin

EXTRA_OECMAKE = ""
