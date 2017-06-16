DESCRIPTION = "Buzz programming language."
LICENSE = "CLOSED"

SRC_URI = "file://buzz.tar.gz"

S = "${WORKDIR}/buzz"

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release -DCCD_DOUBLE=1"


RDEPENDS_${PN}-staticdev = ""
RDEPENDS_${PN}-dev = ""
RDEPENDS_${PN}-dbg = ""

FILES_${PN} = "/usr"
inherit pkgconfig cmake
