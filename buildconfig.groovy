
goldenMaster {
    sourcePath = '../req42-framework/'
    targetPath = 'build/src_gen/'

    templateStyles = ['plain', 'with-help']
    //templateStyles = ['plain']
}

formats = [
    'asciidoc': [imageFolder: true],
    'html': [imageFolder: true],
    'epub': [imageFolder: false],
    'rst': [imageFolder: true],
    'markdown': [imageFolder: true],
    'markdownMP': [imageFolder: true],
    'markdownStrict': [imageFolder: true],
    'markdownMPStrict': [imageFolder: true],
    'gitHubMarkdown': [imageFolder: true],
    'gitHubMarkdownMP': [imageFolder: true],
    'mkdocs': [imageFolder: true],
    'mkdocsMP': [imageFolder: true],
    'textile': [imageFolder: true],
    'textile2': [imageFolder: true],
    'docx': [imageFolder: false],
    'docbook': [imageFolder: true],
    'latex': [imageFolder: true],
]

distribution {
    targetPath = "dist/"
    //formats = ['asciidoc','html','epub','markdown','docx','docbook']
}
