SUMMARY = "Advanced plugin and service introspection"
LICENSE = "GPLv2 | GPLv3 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kconfig kconfig-native kcoreaddons-native kcrash kdbusaddons ki18n kdoctools-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ac350a079c779228290d8ad6f7d95424"
SRC_URI[sha256sum] = "18148badc720eb2a899728ddd69ca0a7e291a371d5d8d404aa39f9b6f6806c4c"

FILES_${PN} += "${datadir}/kservicetypes5"


