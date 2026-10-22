import { Template } from "../../components/Template";

export default function GaleriaPage(){
    return(
        <Template>
            <h1>Galeria</h1>
        </Template>
    ); 
}

const Header: React.FC = () =>{
    return(
        <header className="bg-red-600 text-white py-3">
            <div className="container mx-auto flex items-center jutify-between px-4">
                <h1> class</h1>
            </div>
        </header>
    )
}
