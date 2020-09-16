DESCRIPTION = "Simple helloworld application"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://lshi@mon-scm-repos.hme.com/scm/git/YoctoTest.git;protocol=https"
SRCREV = "9a6e4afeedc0ea9f5d69deb00d575786d305aa85"

S = "${WORKDIR}/git"


do_compile() {
	${CC} hello.c ${LDFLAGS} -o hello
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 hello ${D}${bindir}
}

