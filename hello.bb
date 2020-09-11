DESCRIPTION = "Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://mon-scm-repos.hme.com/scm/git/YoctoTest"

#SRC_URI = "git://mon-scm-repos.hme.com/scm/git/YoctoTest.git;protol=https"

S = "${WORKDIR}"

do_compile() {
	${CC} hello.c ${LDFLAGS} -o hello
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 myhello ${D}${bindir}
}
