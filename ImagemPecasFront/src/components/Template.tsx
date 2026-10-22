interface TemplateProps {
    children: React.ReactNode

}

export const Template: React.FC<TemplateProps> = (props: TemplateProps) => {
    return(
        <>
            // header

            (props.children)

            //footer
        </>
    )
}