DESCRIPTION = "Simple helloworld application"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""


SRC_URI = "git://lshi@mon-scm-repos.hme.com/scm/git/YoctoTest.git;protocol=https"

SRCREV="68f45b3936c1dc644050fe53d43b5ef452582962"

S = "${WORKDIR}/git"

BB_GENERATE_MIRROR_TARBALLS="1"

do_compile() {
	${CC} hello.c ${LDFLAGS} -o myhello
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 myhello ${D}${bindir}
}
