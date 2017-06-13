DESCRIPTION = "ROS package for BUZZ programming language."
LICENSE = "MIT"

DEPENDS = "roscpp std_msgs mavros_msgs sensor_msgs message_generation"
RDEPENDS_${PN} = "roscpp std_msgs mavros_msgs sensor_msgs message_runtime"

SRC_URI = "https://github.com/MISTLab/ROSBuzz/archive/${PV}.tar.gz"

S = "${WORKDIR}/rosbuzz-${PV}/rosbuzz"

inherit catkin

EXTRA_OECMAKE = ""
