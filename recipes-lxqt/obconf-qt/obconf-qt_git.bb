SUMMARY = "Qt port of obconf, the Openbox configuration tool"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt pkgconfig

DEPENDS += "qtx11extras openbox"

SRC_URI += " \
    file://0001-finding-sed-does-not-work-and-is-not-neccessary.patch \
"
SRCREV = "8af9fa5a84d03a77ed001058b18078cc47189a95"
PV = "0.11.0"

FILES_${PN} += "${datadir}/icons"
